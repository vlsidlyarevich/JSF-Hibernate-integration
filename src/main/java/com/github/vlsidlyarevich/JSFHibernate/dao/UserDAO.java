package com.github.vlsidlyarevich.JSFHibernate.dao;

import com.github.vlsidlyarevich.JSFHibernate.entities.UserEntity;
import com.github.vlsidlyarevich.JSFHibernate.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Администратор on 07.03.2016.
 */
public class UserDAO {

    Session session = HibernateUtils.getSessionFactory().openSession();

    public void save(UserEntity userEntity){
        session.beginTransaction();
        session.save(userEntity);
        session.getTransaction().commit();
        session.close();
    }

    public Integer getId (){
        String hql = "select max(user.id) from UserEntity user";
        Query query = session.createQuery(hql);
        List<Integer> results = query.list();
        Integer userId = 1;
        if (results.get(0) != null ) {
            userId = results.get(0) + 1;
        }
        return userId;
    }


}
