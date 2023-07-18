import java.util.ArrayList;
import java.util.List;

public class Collections_Ex5_Insert_Element {
    public static void main(String[] args) {

        List<String> school = new ArrayList<String>();

        school.add("book");
        school.add("notebook");
        school.add("pen");
        school.add("calculator");
        school.add("pencil");

        System.out.println(school);

        school.add(3, "crayons");
        System.out.println(school);

        int length = school.size();
        String[] schoolArray = new String[length + 1];

        for (int i = 0; i < length; i++) {
            schoolArray[i] = school.get(i);
        }
        String element = schoolArray[3];
        schoolArray[3] = "rubber";
        schoolArray[length] = element;

        for (String item : schoolArray) {
            System.out.print(item + " ");
        }
    }
}
