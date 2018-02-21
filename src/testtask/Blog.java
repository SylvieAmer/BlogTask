package testtask;

public class Blog {
     class Post{
        int number;
        String text;
        Post prev;
        Post next;
        public Post(String text, int number, Post prev, Post next){
            this.text = text;
            this.number = number;
            this.prev = prev;
            this.next = next;
    } 
  } //Создание объектов Blog и Post, определение их полей
  Post headPost; //создание объекта класса Post
   int idCount = 1; //счетчик для присвоения идентификаторов для поста
  
  public Blog(){
       headPost = null;
    } //конструктор, где мы создаем новый блог с постами
    
  public void addPost(String text){
	if (headPost == null) {
	headPost = new Post(text, idCount, null, null);
        headPost.prev = headPost;
        headPost.next = headPost;
	}
        else {
        Post newPost = new Post(text, idCount, headPost.prev, headPost.prev.next);
        headPost.prev.next = newPost;
        headPost.prev = newPost;
        }
        idCount++;
    }  //добавление поста в конец (Post:/ posts)
  
  public String getPostTextById(int id){
      Post temp = headPost;
      for (int i=1; i<id; i++){
          temp=temp.next;
      }
      String postText = temp.text;
      return postText;
  } //Возвращает текст поста по айди (Get:/posts/id
  
  public void setPostId(int id, int newId){
        Post temp = headPost;
        for (int i=0; i<id; i++){
            temp = temp.next;
    }
        temp.number = newId;
    } //Редактирование идентификатор поста 
  
  
  public void setPostText(int id, String text){
         Post temp = headPost;
         for (int i=0; i<id; i++){
             temp = temp.next;
         }
         temp.text = text;
    }//Редактирование текста поста по идентификатору (Put:/posts/id)
  
}