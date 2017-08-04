import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExamTest1 {

    Exam1 exam = new Exam1();

    @Test
    public void Test1(){
        Long actualResult = exam.solution(8l);
        Long expectedResult = 8l;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test2(){
        Long actualResult = exam.solution(9l);
        Long expectedResult = 9l;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test3(){
        Long actualResult = exam.solution(20l);
        Long expectedResult = 19l;
//        String  m = exam.findMax(20l);
//        assertEquals("20", m);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test4(){
        Long actualResult = exam.solution(132l);
        Long expectedResult = 129l;
//                String  m = exam.findMax(132l);
//        assertEquals("130", m);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void Test5(){
        Long actualResult = exam.solution(111111111111111110l);
        Long expectedResult = 99999999999999999l;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test6(){
        Long actualResult = exam.solution(989999999999999999l);
        Long expectedResult = 899999999999999999l;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void Test7(){
        Long actualResult = exam.solution(653161544328834085l);
        Long expectedResult = 599999999999999999l;
        assertEquals(expectedResult, actualResult);
    }
}
