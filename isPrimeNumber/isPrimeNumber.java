package isPrimeNumber;

public class isPrimeNumber {
    public static void main(String[] args) {
        int num=20210101;
        int end=(int)Math.sqrt((double) num);
        boolean isPrime=true;
        for (int i = 2; i < end+1; i++) {
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);

    }

}
