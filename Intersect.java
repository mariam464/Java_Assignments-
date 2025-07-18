import java.util.ArrayList;

public class Intersect {
    ArrayList<Integer> firstList = new ArrayList<>();
    ArrayList<Integer> secondList = new ArrayList<>();
    Intersect(ArrayList<Integer> firstList, ArrayList<Integer> secondList){
        this.firstList = firstList;
        this.secondList = secondList;
    }
    ArrayList<Integer> findCommon(){
        ArrayList<Integer> commonElements= new ArrayList<>();
        for(int i=0; i< firstList.toArray().length; i++){
            for (int j =0; j<secondList.toArray().length; j++){
                if(firstList.get(i).equals(secondList.get(j))){
                    commonElements.add(secondList.get(j));
                }
            }
        }
        ArrayList<Integer> uniqueElements = new ArrayList<>();

        for(int i = 0; i<commonElements.toArray().length; i++){
            if(uniqueElements.contains(commonElements.get(i))){
                continue;
            } else{
                uniqueElements.add(commonElements.get(i));
            }
        }

        return uniqueElements;
    } 
     ArrayList<Integer> findUncommon(){
        ArrayList<Integer> uncommonElements= new ArrayList<>();

        for(int i=0; i< firstList.toArray().length; i++){
            if(secondList.contains(firstList.get(i))){

            } else{
                uncommonElements.add(firstList.get(i));
            }
            for(int j =0; j< secondList.toArray().length; j++) {
                if(firstList.contains(secondList.get(j))){

                } else{
                    uncommonElements.add(secondList.get(j));
                }
            }
        }

        ArrayList<Integer> uniqueElements = new ArrayList<>();

        for(int i = 0; i<uncommonElements.toArray().length; i++){
            if(uniqueElements.contains(uncommonElements.get(i))){
                continue;
            } else{
                uniqueElements.add(uncommonElements.get(i));
            }
         }


        return uniqueElements;

     }
}
