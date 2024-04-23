package observer;

import java.util.Vector;

interface Observer {
    public void receiveNotification(String msg);
}

interface Observable {
    public void addSubscriber(User user);
    public void removeSubscriber(User user);
    public void notifyUser(String msg);
}
class User implements Observer {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String msg) {
        System.out.println(msg);
        System.out.println(getName() + " menerima notifikasi: " + msg);
    }

    public void subscribe(Channel channel) {
        channel.addSubscriber(this);
    }

    public void unsubscribe(Channel channel) {
        channel.removeSubscriber(this);
    }

    public String getName() {
        return name;
    }
}

class Channel implements Observable {
    private String name;
    private Vector<User> subscibers;

    public Channel(String name) {
        this.name = name;
        this.subscibers = new Vector<User>();
    }

    @Override
    public void addSubscriber(User user) {
        subscibers.add(user);
    }

    @Override
    public void removeSubscriber(User user) {
        subscibers.remove(user);
    }

    @Override
    public void notifyUser(String msg) {
        System.out.println(name + " posted a new video!");
        String constructedMessage = String.format("%s: %s", name, msg);
        for(User user : subscibers) {
            user.receiveNotification(constructedMessage);
        }
    }
}
class Main {
    public static void main(String[] args) {
        Channel ch = new Channel("Budi Setiawan Channel");
        User user1 = new User("Wika Wika");
        User user2 = new User("Jobot TV");
        User user3 = new User("Jinjit Karunia");

        ch.addSubscriber(user1);
        ch.addSubscriber(user2);
        ch.notifyUser("Ada video baru buat anda! Jangan lupa di subscribe ya!");

        user3.subscribe(ch);
        ch.notifyUser("Video baru!");
    }
}