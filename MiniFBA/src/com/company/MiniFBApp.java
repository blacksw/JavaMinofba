package com.company;

public class MiniFBApp {

    public static void main(String[] args) {
	 User my_user = new User("Dorin");
     User close_user = new User("Kate");
        User common_user = new User("Florin");
        my_user.addCloseFriend(close_user);
        my_user.addCommonFriend(common_user);
        my_user.remove();
        System.out.println(my_user);
    }
}
