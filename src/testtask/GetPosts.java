package testtask;

public class GetPosts extends Blog {
  public GetPosts(){
      getPostsList();
  }
  public int[] getPostsList(){
      int [] mas = new int[idCount-1];
      Post temp = headPost;
      for (int i=0; i<idCount; i++){
          for (int j=0; j<idCount-1; j++){
              mas[j] = temp.number;
              temp =temp.next;
              
          }
      }
    return mas;
} //Получение списка идентификаторов постов (Get:/posts)
}
