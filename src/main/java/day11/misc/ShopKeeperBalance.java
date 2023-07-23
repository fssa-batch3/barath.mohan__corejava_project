package day11.misc;

public class ShopKeeperBalance {

	    public static void main(String[] args) {
	        int[] ar= {30,30,60,120,60};
	        int bal=0;
	        int check=0;
	        for(int i=0;i<ar.length;i++){
	            if(ar[i]==30){
	                bal+=ar[i];
	            }
	            else{
	                int amount = ar[i]-30;
	                bal+=30;
	                if(bal<amount){
	                    check=1;
	                    break;
	                }
	                bal-=amount;
	            }
	        }
	        if(check==1){
	            System.out.print("Transaction Failed !");  
	            
	        }
	        else{
	          System.out.print("Transaction Successful !");
	        }
	        
	    }
	}

