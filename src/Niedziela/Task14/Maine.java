package Niedziela.Task14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Maine {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader("src/Score.csv"));
        String line = reader.readLine();

        List<Score> listScore = new ArrayList<>();


        while (line != null) {
            System.out.println(line);
            String[] tablicaScore = line.split(",");
            Score score = new Score(tablicaScore[0], tablicaScore[1], tablicaScore[2]);
            listScore.add(score);
            line = reader.readLine();
        }
        reader.close();

        System.out.println();
        System.out.println("*******PrzepisanieZPliku**********************");
        System.out.println(listScore);

        System.out.println();
        System.out.println("*******SORTMIN***************************");
        List<Score> sortMin = listScore.stream()
                .sorted(Comparator.comparing(score -> score.getTimestamp()))
                .collect(Collectors.toList());

        System.out.println(sortMin);

        System.out.println();
        System.out.println("*********SORTMAX*******************");

        List<Score> sortMax = listScore.stream()
                .sorted(Comparator.comparing(Score::getTimestamp).reversed())
                .collect(Collectors.toList());

        System.out.println(sortMax);


        System.out.println();
        System.out.println("********NajnowszeWyniki*****************");

        List<Score> najnowszeWyniki = listScore.stream()
                .sorted(Comparator.comparing(score -> score.getTimestamp()))
                .limit(5)
                .collect(Collectors.toList());


        System.out.println(najnowszeWyniki);


        System.out.println();
        System.out.println("********NajnowszeWyniki*****************");

        calculateWinner(listScore);


    }

    public static Map<String, Integer> calculateWinner(List<Score> list){
        Map<String, Integer> map = new HashMap<>();
        list.forEach(score -> {
            String winnerName = score.getWinner();
            if(map.containsKey(winnerName)){
                int x = map.get(winnerName);
                x++;
                map.put(winnerName,x);
            }
            else{
                map.put(winnerName,1);
            }
        });
        return map;
    }
}