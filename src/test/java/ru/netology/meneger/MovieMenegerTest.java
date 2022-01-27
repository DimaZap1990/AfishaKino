package ru.netology.meneger;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieMenegerTest {
    private Movie one = new Movie (1, "Бладшот", "Боевик");
    private Movie two = new Movie(2, "Вперед", "Мультфильм");
    private Movie three = new Movie(3, "Отель Белград", "Комедия");
    private Movie four = new Movie(4, "Джентельмены", "Боевик");
    private Movie five = new Movie(5, "Человек - невидимка", "Ужасы");
    private Movie six = new Movie(6, "Тролли.Мировой тур", "Мульфильм");
    private Movie seven = new Movie(7, "Номер один", "Комедия");
    private Movie eight = new Movie(8, "Последний охотник на ведьм", "Боевик");
    private Movie nine = new Movie(9, "Человек-паук", "Фантастика");
    private Movie ten = new Movie(10, "Зеркала", "Ужасы");

    @Test
    public void lastTenAddMovie(){
        MovieMeneger meneger=new MovieMeneger();
        meneger.getMovie(one);
        meneger.getMovie(two);
        meneger.getMovie(three);
        meneger.getMovie(four);
        meneger.getMovie(five);
        meneger.getMovie(six);
        meneger.getMovie(seven);
        meneger.getMovie(eight);
        meneger.getMovie(nine);
        meneger.getMovie(ten);
        Movie[] actual= meneger.lastAddMovie(10);
        Movie[] expected= new Movie[]{ten, nine,eight, seven, six, five, four,three, two, one};
        assertArrayEquals(expected,actual);
    }
    @Test
    public void lastFiveAddMovie(){
        MovieMeneger meneger=new MovieMeneger();
        meneger.getMovie(one);
        meneger.getMovie(two);
        meneger.getMovie(three);
        meneger.getMovie(four);
        meneger.getMovie(five);
        meneger.getMovie(six);
        meneger.getMovie(seven);
        meneger.getMovie(eight);
        meneger.getMovie(nine);
        meneger.getMovie(ten);
        Movie[] actual= meneger.lastAddMovie(5);
        Movie[] expected= new Movie[]{ten, nine,eight, seven, six};
        assertArrayEquals(expected,actual);
    }

}