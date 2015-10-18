class SolveforAddend {

	int[] ar1 = {3214, 3426, 5432, 1278, 1231, 9877};
	int[] ar2 = {6547, 7643, 8123, 5467, 1235, 5678};
	int[] ar3 = {2357, 8765, 2650, 2136, 5643, 4538};
	int[] ar4 = {8890, 2453, 2346, 1649, 7645, 9875};
	int[] ar5 = {8760, 9465, 1874, 4583, 1867, 8641};
	int sum = 34701;

	public SolveforAddend() { 

		find();
	}

	public void find() {

		int[] ans = {0};
		
		for (int a = 0; a<=5; a++) {
			for (int b = 0; b<=5; b++) {
				for (int c = 0; c<=5; c++) {
					for (int d = 0; d<=5; d++) {
						for (int e = 0; e<=5; e++) {
							ans[0] = ar1[a] + ar2[b] + ar3[c] + ar4[d] + ar5[e];
							if(ans[0] == sum){
								System.out.println(ar1[a]);
								System.out.println(ar2[b]);
								System.out.println(ar3[c]);
								System.out.println(ar4[d]);
								System.out.println(ar5[e]);					
							}
						}
					}
				}
			}
		}
	}

}

public class Exercise1 {
	
	public static void main(String[] args) {
		SolveforAddend Alfi = new SolveforAddend();
	}

}