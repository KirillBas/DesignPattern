package ru.basharin.iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"JavaScript", "React", "ViewJS"};
        JavaScriptDeveloper javaScriptDeveloper = new JavaScriptDeveloper("Kirill Basharin", skills);

        Iterator iterator = javaScriptDeveloper.getIterator();

        System.out.println(javaScriptDeveloper.getName());
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
