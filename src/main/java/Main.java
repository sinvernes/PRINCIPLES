public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.surname = "Иванов";
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.number = "+7 (999)-999-99-99";
        post.passport = "4444 № 44444444";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
