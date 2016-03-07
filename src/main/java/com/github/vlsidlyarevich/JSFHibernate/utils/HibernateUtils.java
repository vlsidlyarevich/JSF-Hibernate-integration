package com.github.vlsidlyarevich.JSFHibernate.utils;

import com.github.vlsidlyarevich.JSFHibernate.entities.UserEntity;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    public static void ConfDownload(){
            try {
                AnnotationConfiguration aconf = new AnnotationConfiguration()
                        .addAnnotatedClass(UserEntity.class);
                Configuration conf = aconf.configure();
            }
            catch (Exception e){
                e.printStackTrace();
            }
    }
}
