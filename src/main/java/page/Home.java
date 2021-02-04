package page;

import api.Post;
import table.M.PostM;

import java.util.List;

public class Home {
    private static String beforeMenu = "<!DOCTYPE html>\n" + "<html lang=\"ru\">\n" + "\n" + "<head>\n" + "   <meta charset=\"utf-8\">" + "   <link rel=\"stylesheet\" href=\"/content/theme/home.css\">\n" + "</head>\n" + "\n" + "<body>\n" + "<header>\n";
    private static String aftermenu = "</header>\n" + "<main>\n" + "    <div class='block'>";
    //slider
    private static String homePage2 = "<a href=\"";
    // href
    private static String homePage3 = "\">\n" + "            <img src=\"";
    // img
    private static String homePage4 = "\" />\n" + "            <div>\n" + "                <h3>";
    //Title
    private static String homePage5 = "</h3>\n" + "                <p>";
    //description
    private static String homepage6 = " </p>\n" + "            </div>\n" + "        </a>";
    //end item from block1 
    private static String homepage7 = "  </div>\n" + "    <div class='block2'>\n" + "        <div class='red'>\n" + "            <h2>Новое</h2>";
    // block 2/1 
    private static String homepage8 = "<a href='";
    //hreg 
    private static String homepage9 = "'>\n" + "                <img src=\"";
    //img 
    private static String homepage10 = "\" />\n" + "                <h3>";
    //title 
    private static String homepage11 = "</h3>\n" + "                <p>";
    //description 
    private static String homepage12 = "</p>\n" + "            </a>";
    //end item 
    private static String homepage13 = "</div>\n" + "        <div class='blue'>\n" + "            <h2>Популярное</h2>";
    //start block 2/2 
    private static String homepage14 = "</div>\n" + "        <div class='green'>\n" + "            <h2>Последнее обновления</h2>";
    //start block 2/3 
    private static String homepage15 = "</div>\n" + "    </div>\n" + "</main>\n" + "<footer></footer>\n" + "</body>\n" + "</html>";

    public static String getPage(String userId) {
        List<PostM> random = Post.getRandomM(6, 0);
        List<PostM> lastUpdate = Post.getLastUpdateM(5, 0);
        List<PostM> newPost = Post.getNewM(5, 0);
        List<PostM> morePopular = Post.getMorePopularM(5, 0);
        String result = beforeMenu + menu.getMenu(true) + aftermenu;
        for (PostM item : random)
            result += homePage2 + item.getPostId() + homePage3 + item.getPostImg() + homePage4 + item.getTitle() + homePage5 + item.getNameOrig() + homepage6;
        result += homepage7;
        for (PostM item : newPost)
            result += homepage8 + item.getPostId() + homepage9 + item.getPostImg() + homepage10 + item.getTitle() + homepage11 + item.getNameOrig() + homepage12;
        result += homepage13;
        for (PostM item : morePopular)
            result += homepage8 + item.getPostId() + homepage9 + item.getPostImg() + homepage10 + item.getTitle() + homepage11 + item.getNameOrig() + homepage12;
        result += homepage14;
        for (PostM item : lastUpdate)
            result += homepage8 + item.getPostId() + homepage9 + item.getPostImg() + homepage10 + item.getTitle() + homepage11 + item.getNameOrig() + homepage12;
        result += homepage15;
        return result;
    }
}