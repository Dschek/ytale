package dbApi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import table.M.*;
import table.N.*;
import table.User.*;


public class HibernateUtil {
    private static SessionFactory sf = null;
    static {
        Configuration cfg = new Configuration().configure();
        cfg.addAnnotatedClass(CategoryM.class);
        cfg.addAnnotatedClass(CategoryPostM.class);
        cfg.addAnnotatedClass(CommentGlavaM.class);
        cfg.addAnnotatedClass(CommentPostM.class);
        cfg.addAnnotatedClass(GlavaM.class);
        cfg.addAnnotatedClass(HistoryReadM.class);
        cfg.addAnnotatedClass(PostM.class);
        cfg.addAnnotatedClass(PurchasesM.class);
        cfg.addAnnotatedClass(SubscriptionM.class);
        cfg.addAnnotatedClass(TagM.class);
        cfg.addAnnotatedClass(TagPostM.class);
        cfg.addAnnotatedClass(CategoryN.class);
        cfg.addAnnotatedClass(CategoryPostN.class);
        cfg.addAnnotatedClass(CommentGlavaN.class);
        cfg.addAnnotatedClass(CommentPostN.class);
        cfg.addAnnotatedClass(GlavaN.class);
        cfg.addAnnotatedClass(HistoryReadN.class);
        cfg.addAnnotatedClass(PostN.class);
        cfg.addAnnotatedClass(PurchasesN.class);
        cfg.addAnnotatedClass(SubscriptionN.class);
        cfg.addAnnotatedClass(TagN.class);
        cfg.addAnnotatedClass(TagPostN.class);
        cfg.addAnnotatedClass(AuthData.class);
        cfg.addAnnotatedClass(Group.class);
        cfg.addAnnotatedClass(Message.class);
        cfg.addAnnotatedClass(PayHistory.class);
        cfg.addAnnotatedClass(Profile.class);
        cfg.addAnnotatedClass(User.class);
        cfg.addAnnotatedClass(UserGroup.class);

        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
        StandardServiceRegistry serviceRegistry = builder.build();
        try {
            sf = cfg.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sf;
    }

    public static Session getSession() {
        return sf.openSession();
    }

    public static void close() {
        sf.close();
    }


}
