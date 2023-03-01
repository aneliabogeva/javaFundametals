package main.objectsAndClassesLab;

import java.util.ArrayList;
import java.util.Scanner;

public class Song {
    String typeList;
    String name;

    @Override
    public String toString() {
        return name;
    }

    String time;

    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Song(String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        ArrayList<Song> songsList = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String[] input = scanner.nextLine().split("_");
            Song songs = new Song(input[0], input[1], input[2]);
            songsList.add(songs);
        }
        String typeList = scanner.nextLine();
        if(typeList.equals("all")){
            for (Song name:songsList) {
                System.out.println(name.toString());
            }
        }else{
            for (Song name : songsList) {
                if (name.getTypeList().contains(typeList)) {
                    System.out.println(name.toString());
                }
            }
        }
    }
}
