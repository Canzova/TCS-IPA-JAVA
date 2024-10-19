import java.util.*;


public class Solution {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        
        Document arr[] = new Document[4];
        for(int i = 0; i < 4; i++){
            int id = sc.nextInt();
            sc.nextLine();
            
            String title = sc.nextLine();
            
            String folderName = sc.nextLine();
            
            int pages = sc.nextInt();
            //sc.nextLine();
            
            Document obj = new Document(id, title, folderName, pages);
            
            arr[i] = obj;
        }
        
        Document ans[] = docsWithOddPages(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i].getId() + " " + ans[i].getTitle() + " " + ans[i].getFolderName() + " " + ans[i].getPages());
        }
        
        
        sc.close();
    }
    
    public static Document [] docsWithOddPages(Document arr[]){
        ArrayList<Document>tempans = new ArrayList<>();
        
        for(int i =0; i < arr.length; i++){
            if(arr[i].getPages() % 2 != 0){
                // Odd
                tempans.add(arr[i]);
            }
        }
        
        Collections.sort(tempans, (a, b)->{
            return (a.getId()- b.getId());
        });
        
        Document ans[] = tempans.toArray(new Document[tempans.size()]);
        
        return ans;
    }
    
    
}

class Document{
    private int id;
    private String title;
    private String folderName;
    private int pages;
    
    public int getPages(){
        return this.pages;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getFolderName(){
        return this.folderName;
    }
    
    public int getId(){
        return this.id;
    }
    
    Document(int id, String title, String folderName, int pages){
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
        
    }
}