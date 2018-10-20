package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class User {
String name;

// Relations
User close_friend;
User common_fiend;
// Relation

int friends_count;
User(String name){
    this.name = name;
    this.friends_count = 0;
    }

    public  void addCloseFriend(User cf){
        this.close_friend = cf;
        this.friends_count++;
    }
    // добавить опцию + remove()...2
    public void remove(){
        this.common_fiend = null;
        this.close_friend = null;
    }

    public  void addCommonFriend(User cf){
        this.common_fiend = cf;
        this.friends_count++;
    }
//    допилить if else так чтобы не выводился null
  public String toString(){
    return "\n\n USER:("+ this.name+")" + "\n friends ("+this.friends_count+")\n" + "\n my friends are : \n\t " +
            this.close_friend + ",\n\t" + this.common_fiend + "\n";
    }
}
