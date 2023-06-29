package ch8.template_method.barista_hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends BeverageWithHook {
    @Override
    public void brew() {
        System.out.println("brewing coffee...");
    }

    @Override
    public void addComplements() {
        System.out.println("adding milk and sugar...");
    }

    @Override
    public boolean customerWantsComplements() {
        return getUserInput().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("커피에 우유와 설탕을 넣을까요 (y/n)?");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            answer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return answer == null ? "no" : answer;
    }
}
