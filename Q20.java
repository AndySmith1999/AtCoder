import java.util.HashMap;
import java.util.Map;

import org.xml.sax.HandlerBase;

public class Q20 {

    public int solution(int[] A){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.length; i++){
            if(map.get(A[i]) == null){
                map.put(A[i],1);
            }else{
                int num = map.get(A[i]);
                num++;
                map.put(A[i], num);
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()%2!=0){
                return entry.getKey();
            }
        }
        return
    }

    public static void main(String[] args){

    }
}
