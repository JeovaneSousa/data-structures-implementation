package vector;

import java.util.Arrays;

public class Vector {

    private Student[] students = new Student[100];
    private int studentTotal = 0;

    public boolean validPosition(int position){
        return position >= 0 && position <= studentTotal;
    }
    public void add(int position, Student student){
        if(!validPosition(position)){
            throw new IllegalArgumentException("Invalid Position");
        }
        for(int i = studentTotal  - 1; i >= position; i--){
            students[i + 1] = students[i];
        }
        students[position] = student;
        studentTotal++;
    }

    public void add(Student student){
        this.students[this.studentTotal] = student;
        this.studentTotal++;
    }

    public boolean occupiedPosition(int position){
            return position >= 0 && position < this.studentTotal;
        }
    public Student get(int position){
        if(!occupiedPosition(position)){
            throw new IllegalArgumentException("Invalid position");
        }
        else{
            return students[position];
        }
    }

    public void remove(int index){
        if(!occupiedPosition(index)){
            throw new IllegalArgumentException("Invalid position");
        }
        for(int i = index; i < studentTotal; i++){
            students[i] = students[i + 1];
        }
    }

    public boolean contains(Student student) {
        for (int index = 0; index < studentTotal; index++) {
            if(student.equals(students[index])){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return this.studentTotal ;
    }

    public String toString(){
        return Arrays.toString(students);
    }
}
