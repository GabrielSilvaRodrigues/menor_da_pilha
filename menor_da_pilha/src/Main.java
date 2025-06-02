import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int q = sc.nextInt();
            Stack<Integer> presentes = new Stack<>();
            for (int i = 0; i < q; i++) {
                String acao = sc.next();
                if (acao.equals("PUSH")) {
                    int diversao = sc.nextInt();
                    presentes.push(diversao);
                } else if (acao.equals("MIN")) {
                    if (presentes.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        int menosDivertido = presentes.get(0);
                        for (int j = 1; j < presentes.size(); j++) {
                            int diversaoPresente = presentes.get(j);
                            if (diversaoPresente < menosDivertido) {
                                menosDivertido = diversaoPresente;
                            }
                        }
                        System.out.println(menosDivertido);
                    }
                } else if (acao.equals("POP")) {
                    if (presentes.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        presentes.pop();
                    }
                }
            }
        }
        sc.close();
    }
}