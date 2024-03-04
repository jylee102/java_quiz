package ch11;

public class Quiz05 {
    /*
    5. 잘못된 예외 처리
        ➊ try { method1( ); } catch (Exception e) { }
        ➋ void method2( ) throws Exception { method1( ); }
        ➌ try { method1( ); }
            catch (Exception e) { }
            catch (ClassNotFoundException e) { }
        ➍ try { method1( ); }
            catch (ClassNotFoundException e) { }
            catch (NumberFormatException e) { }

        3번. Exception 예외는 가장 마지막에 사용해야 한다.
     */
}
