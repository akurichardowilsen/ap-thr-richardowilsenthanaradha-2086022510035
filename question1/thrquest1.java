import java.util.*;

public class thrquest1 {
    public static void main(String[] args) {
        String input = "holly may interesting MARCH corey November junior january paul december";
        String[] words = input.split(" ");
        
        Stack<String> inputStack = new Stack<>();
        for (String w : words) inputStack.push(w);

        List<String[]> pairs = new ArrayList<>();
        while (!inputStack.isEmpty()) {
            String month = inputStack.pop();
            String name = inputStack.pop();
            pairs.add(new String[]{name, month});
        }

        // Sort berdasarkan urutan bulan (manual mapping)
        pairs.sort(Comparator.comparingInt(p -> getMonthValue(p[1])));

        // 3. Masukkan hasil akhir ke Stack sesuai constraint [cite: 22]
        Stack<String> resultStack = new Stack<>();
        for (String[] pair : pairs) {
            resultStack.push(pair[0]);
            resultStack.push(pair[1]);
        }

        // 4. Output sebagai array [cite: 23]
        System.out.println(resultStack);
    }

    private static int getMonthValue(String m) {
        String lower = m.toLowerCase();
        switch(lower) {
            case "january": return 1; case "march": return 3;
            case "may": return 5; case "november": return 11;
            case "december": return 12; default: return 0;
        }
    }
}