import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExamTest1 {

    Exam1 exam = new Exam1();

    @Test
    public void Test1(){
        Long actualResult = 8l;
        Long expectedResult = exam.solution(8l);
        assertEquals(expectedResult, actualResult);
    }

    @Test 
    public void Test2(){
        Long actualResult = 9l;
        Long expectedResult = exam.solution(9l);
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void Test3(){
        Long actualResult = 19l;
        Long expectedResult = exam.solution(20l);
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void Test4(){
        Long actualResult = 129l;
        Long expectedResult = exam.solution(132l);
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void Test5(){
        Long actualResult = 999999999l;
        Long expectedResult = exam.solution(1111111110l);
        assertEquals(expectedResult, actualResult);
    }

    @Test @Ignore
    public void Test6(){
        Long actualResult = 8l;
        Long expectedResult = exam.solution(8l);
        assertEquals(expectedResult, actualResult);
    }


    @Test @Ignore
    public void Test7(){
        Long actualResult = 8l;
        Long expectedResult = exam.solution(8l);
        assertEquals(expectedResult, actualResult);
    }
}
