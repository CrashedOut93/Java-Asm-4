import java.util.LinkedList;
import java.util.ListIterator;

public class Iterate {

    public static void main(String[] args) {
        LinkedList<String> bball = new LinkedList<>();

        bball.add("Mavericks");
        bball.add("Lakers");
        bball.add("Celtics");

        //System.out.println(bball.getFirst());

        ListIterator<String> iter = bball.listIterator();

        if(iter.hasNext()){
            iter.next();
            iter.add("Magic");
        }
        for(String team: bball){
            System.out.print(team + " ");
        }
    }

}
