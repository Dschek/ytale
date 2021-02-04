package page;

public class menu {
    private static String  menu1 = "    <nav class=\"menu flex\">\n" +
            "        <ul class=\"flex\">\n" +
            "            <li><a href=\"/\">\n" +
            "                <svg height=\"2em\" fill=\"#ffffff\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 48 48\"\n" +
            "                     xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n" +
            "                    <path\n" +
            "                            d=\"m39,3h6v13.017l-6-6.858v-6.159zm3,21l-18-20.568-18,20.568h-6l21-24h6l21,24h-6zm0,3.876v20.124h-12v-15c0-1.659-1.341-3-3-3h-6c-1.656,0-3,1.341-3,3v15h-12v-20.127l18-19.89 18,19.893z\" />\n" +
            "                </svg>\n" +
            "            </a></li>\n" +
            "            <li><a href=\"category.html\">Категории</a></li>\n" +
            "            <li class='d'><a href=\"#\">Случайная</a></li>\n" +
            "        </ul>\n" +
            "        <ul class=\"flex\">\n" +
            "            <li class=\"d search\">\n" +
            "                <svg height=\"3em\" fill=\"#ffffff\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 16 16\">\n" +
            "                    <path fill-rule=\"evenodd\"\n" +
            "                          d=\"M15.7 13.3l-3.81-3.83A5.93 5.93 0 0 0 13 6c0-3.31-2.69-6-6-6S1 2.69 1 6s2.69 6 6 6c1.3 0 2.48-.41 3.47-1.11l3.83 3.81c.19.2.45.3.7.3.25 0 .52-.09.7-.3a.996.996 0 0 0 0-1.41v.01zM7 10.7c-2.59 0-4.7-2.11-4.7-4.7 0-2.59 2.11-4.7 4.7-4.7 2.59 0 4.7 2.11 4.7 4.7 0 2.59-2.11 4.7-4.7 4.7z\" />\n" +
            "                </svg>\n" +
            "                <form action=\"\">\n" +
            "                    <input type=\"text\">\n" +
            "                    <button>\n" +
            "                        <svg height=\"3em\" fill=\"#ffffff\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 16 16\">\n" +
            "                            <path fill-rule=\"evenodd\"\n" +
            "                                  d=\"M15.7 13.3l-3.81-3.83A5.93 5.93 0 0 0 13 6c0-3.31-2.69-6-6-6S1 2.69 1 6s2.69 6 6 6c1.3 0 2.48-.41 3.47-1.11l3.83 3.81c.19.2.45.3.7.3.25 0 .52-.09.7-.3a.996.996 0 0 0 0-1.41v.01zM7 10.7c-2.59 0-4.7-2.11-4.7-4.7 0-2.59 2.11-4.7 4.7-4.7 2.59 0 4.7 2.11 4.7 4.7 0 2.59-2.11 4.7-4.7 4.7z\" />\n" +
            "                        </svg>\n" +
            "                    </button>\n" +
            "                </form>\n" +
            "            </li>\n" +
            "            <li class='d'><a href=\"#\">\n" +
            "                <svg height=\"2em\" fill=\"#ffffff\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 48 48\"\n" +
            "                     xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n" +
            "                    <path\n" +
            "                            d=\"m39,42h-30c-4.971,0-9-4.029-9-9v-18c0-4.971 4.029-9 9-9h30c4.968,0 9,4.029 9,9v18c0,4.971-4.032,9-9,9zm-30-30c-.735,0-1.38,.294-1.902,.732l16.902,11.268 16.905-11.268c-.522-.438-1.173-.732-1.905-.732h-30zm33,6l-18,12-18-12v12l9-3-8.121,8.121c.543,.543 1.293,.879 2.121,.879h30c.828,0 1.578-.336 2.121-.879l-8.121-8.121 9,3v-12z\" />\n" +
            "                </svg>\n" +
            "            </a></li>\n" +
            "            <li class='profile'>\n" +
            "                <svg height=\"3em\" fill=\"#ffffff\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 48 48\"\n" +
            "                     xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n" +
            "                    <path d=\"M24,21A10,10,0,1,1,34,11,10,10,0,0,1,24,21ZM24,5a6,6,0,1,0,6,6A6,6,0,0,0,24,5Z\" />\n" +
            "                    <path\n" +
            "                            d=\"M42,47H6a2,2,0,0,1-2-2V39A16,16,0,0,1,20,23h8A16,16,0,0,1,44,39v6A2,2,0,0,1,42,47ZM8,43H40V39A12,12,0,0,0,28,27H20A12,12,0,0,0,8,39Z\" />\n" +
            "                </svg>\n" +
            "                <ul>\n" +
            "                    <li><a href=\"#\">Пользователь*</a></li>\n" +
            "                    <li><a href=\"#\">Сообщения</a></li>\n" +
            "                    <li><a href=\"#\">Баланс*</a></li>\n" +
            "                    <li><a href=\"#\">Закладки</a></li>\n" +
            "                    <li><a href=\"#\">Выйти/Войти</a></li>\n" +
            "                </ul>\n" +
            "            </li>\n" +
            "        </ul>\n" +
            "    </nav>\n" ;
    public static String getMenu(boolean isLogin){
        return menu1;
    }
}
