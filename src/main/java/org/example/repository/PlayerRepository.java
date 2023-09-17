package org.example.repository;

import org.example.model.Player;
import org.example.utils.HibernateFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.UUID;

public class PlayerRepository implements CRUDRepository<Player> {
    @Override
    public Player findById(UUID id) {
        return HibernateFactory.getSession().openSession().get(Player.class, id);
    }
    public Player existByName(String name)  {
        return HibernateFactory.getSession().openSession().get(Player.class, name);
    }

    @Override
    public void save(Player entity) {
        Session session = HibernateFactory.getSession().openSession();
        session.save(entity);
        session.close();

    }

    @Override
    public void update(Player entity) {

    }

    @Override
    public void delete(Player entity) {

    }
}
