class Prime {
    /** Check if a number is prime */
    boolean IsPrime(final int Number) {
        if(Number<2){
            return false;
        }else{
            for(int x=2; x*x<=Number; x++){
                if( Number%x==0 ) return false;
            }
        }
        return true;
    }
}