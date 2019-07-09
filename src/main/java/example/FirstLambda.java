package example;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class FirstLambda implements RequestHandler<Integer, String> {



        public String myHandler(int myCount, Context context) {
            LambdaLogger logger = context.getLogger();
            logger.log("received : " + myCount);
            return String.valueOf(myCount + "konrad");
        }

    public String handleRequest(Integer integer, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("received : " + integer);
        return String.valueOf(integer + "konrad");
    }
}
