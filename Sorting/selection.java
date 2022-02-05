
public class selection {
 public static void main(String args[]) {
	 
	 int arr[]= {12,45,23,78,11};
	 for(int k=0;k<arr.length;k++) {
		 System.out.print(arr[k]+"\t");
	 }
	 for(int j=0;j<arr.length;j++) {
		 int min=j;
	 for(int i=j+1;i<arr.length;i++) {
		 if(arr[i]<arr[min]) {
			 min=i;
		 }
		 if(min!=j) {
			 int temp=arr[j];
			 arr[j]=arr[min];
			 arr[min]=temp;
		 } 
	 }
	 }
	 System.out.println();
	 for(int k=0;k<arr.length;k++) {
		 System.out.print(arr[k]+"\t");
	 }
 }
}
