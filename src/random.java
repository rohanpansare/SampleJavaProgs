import java.util.Random;

/** Generate 10 random integers in the range 0..99. */
public final class random {
static int random[] = new int[10];



    public static final void main(String... aArgs){
        log("Generating 10 random integers in range 0..99.");

        //note a single Random object is reused here
        Random randomGenerator = new Random();
        for (int idx = 0; idx < 10; ++idx){

            int randomInt = randomGenerator.nextInt(10);
            for (int i=0;i<idx;i++) {
              if(random[idx]==randomInt)
                random[idx] = randomInt;
            }
          //  log("Generated : " + randomInt);
        }
        for ( int random1:random) {
            System.out.println(random1);
        }

        log("Done.");
    }

    private static void log(String aMessage){
        System.out.println(aMessage);
    }
}