class Printer {
    public static void main(String[] args) {
        final int PrimeUpTo =1000;
        final int RowSize = 50;
        final int ColumnSize = 4;
        int P[] = new int[PrimeUpTo+1];
        int InitialNumber = 2;
        int PageNumber = 1;
        int PageOffSet = 1;
        int PositionPrime = 1;        
        /** Blucle to evaluate each number */
        for (int Number = InitialNumber; PositionPrime <= PrimeUpTo; Number++) {
            /** class instance evaluates if it is prime  */
            Prime Prime = new Prime();
			if (Prime.IsPrime(Number)) {
                /** Store the primes in array */
                P[PositionPrime]=Number;
                PositionPrime++;
			}
        }  
        /** Print primes in rows, columns and pages  */
        while (PageOffSet <= PrimeUpTo) {
            System.out.println("The First " + PrimeUpTo + " Prime Numbers | Page " + PageNumber + " | \n");   
            /** Print primes in rows */     
            for (int RowOffSet=PageOffSet; RowOffSet <= PageOffSet+RowSize-1; RowOffSet++) {
                /** Print primes in columns  */
                for (int ColumnCount = 0; ColumnCount <= ColumnSize - 1; ColumnCount++)
                    /** Print primes in pages  */
                    if (RowOffSet + ColumnCount * RowSize <= PrimeUpTo)
                        System.out.printf("%10d", P[RowOffSet + ColumnCount * RowSize]);
                        System.out.println();
            }
            System.out.println("\f");
            PageNumber++;
            PageOffSet += RowSize*ColumnSize;
        }
    }
}