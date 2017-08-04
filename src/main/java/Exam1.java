public class Exam1 {

    Long diff = 0l;

    public Long solution(Long n ){
        Long result = n ;
        String max ="";
//        while(check(result)){
//
//                result = result-1;
//        }
//        return result;
        if (n>=10){
            max = findMax(n);
        }
        else{
            return n ;
        }
        result = Long.parseLong(max,10);
        return result;
    }

    public String findMax(Long n) {
        String m = n.toString();
        String result = "";
        char[] x = m.toCharArray();
        boolean isCheck = true;
        int first =0;
        int second =0;

        for (int i = 0; i < m.length() ; i++) {
            if (isCheck) {
                first = Integer.parseInt(m.charAt(i) + "");
                second = Integer.parseInt(m.charAt(i + 1) + "");
                if (first >= second) {
                    isCheck = false;
                    if (second == 0){
                        result = result+String.valueOf(first-1);
                    }
                    else{
                        result = result+String.valueOf(first-1);
                    }
                }
                else{
                    result = result + m.charAt(i);
                }
            }
            else{
                result += "9";
            }
        }
//        result = String.valueOf(x);
        return result;
    }

    public boolean check(Long n) {
//        String  m = n.toString();
        boolean isCheck = false;
//        if (n <10){
//            return isCheck;
//        }
//        else{
//            for (int i = 0; i < m.length()-1 ; i++) {
//                int first = Integer.parseInt(m.charAt(i)+"");
//                int second = Integer.parseInt(m.charAt(i+1)+"");
//                if (first >=second ){
//                    isCheck = true;
//                    break;
//                }
//
//            }
//        }
        return isCheck;

    }
    public int checkLength(Long n) {
        String m = n.toString();
        return m.length();
    }
}
