package com.ajay.edulearn.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.websocket.Session;

@Repository
    public class UserDaoImpl {

        @Autowired
        private EntityManager em;

        public Users save(Users user) {
            Session session = em.unwrap(Session.class);
            session.getUserProperties();
            return user;
        }

    }
