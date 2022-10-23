package ru.agentche;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 23.10.2022
 */
public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
