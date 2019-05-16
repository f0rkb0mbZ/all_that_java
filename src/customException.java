class NoMatchFoundException extends Exception{
        public NoMatchFoundException(String s){
            super(s);
        }
}

public class customException {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Usage: java customException listlength(int) list(str array[listlength]) item_to_search");
        } else {
            int n = Integer.parseInt(args[0]);
            String[] arr = new String[n];
            for(int i = 0;i<n;i++){
                arr[i] = args[i+1];
            }
            String searchable = args[n+1];
            boolean isFound = false;
            try{
                for(int i = 0;i<arr.length;i++){
                    if(searchable.equals(args[i])){
                        isFound = true;
                    }
                }
                if(!isFound)
                    throw new NoMatchFoundException(searchable);
                else
                    System.out.println(searchable + " found in the list!");
            } catch (NoMatchFoundException e){
                System.out.println("Not found! "+e);
            }
        }
    }
}
