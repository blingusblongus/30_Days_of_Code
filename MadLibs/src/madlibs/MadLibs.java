/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madlibs;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Nick
 */
public class MadLibs {
    
    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();
    
    // Getters
    
    public String getStory(){
        return story;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAdjective1(){
        return adjective1;
    }
    
    public String getAdjective2(){
        return adjective2;
    }
    
    public String getNoun1(){
        return noun1;
    }
    
    public String getNoun2(){
        return noun2;
    }

    public String getNoun3(){
        return noun3;
    }
    
    public String getAdverb() {
        return adverb;
    }
    
    public String getRandomNums(){
        return randomNums;
    }
    
    // Setters
    
    public void setStory(String newStory){
        this.story = newStory;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setAdjective1(String newAdj1){
        this.adjective1 = newAdj1;
    }

    public void setAdjective2(String newAdj2){
        this.adjective1 = newAdj2;
    }    
    
    public void setNoun1(String noun1){
        this.noun1 = noun1;
    }
    
    public void setNoun2(String noun2){
        this.noun2 = noun2;
    }
    
    public void setNoun3(String noun3){
        this.noun3 = noun3;
    }
    
    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }
    
    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while(index<numberHolder.length){
            numberHolder[index] = num + index;
            index++;
        }
        randomNums = "not "+numberHolder[0]+", not "+numberHolder[1]+", not "+numberHolder[2];
    }
    
    public void printInstructions(){
        System.out.println("Welcome to the MadLibs game.\nIf you type in words, we'll give you a story.\nStart by typing in a name:");
    }
    
    public void enterName() {
        setName(scanner.nextLine());
    }
    
    public void enterNoun1() {
        System.out.println("Give me a noun.");
        setNoun1(scanner.nextLine());
    }
    
    public void enterNoun2() {
        System.out.println("Give me a noun.");
        setNoun2(scanner.nextLine());
    }
    
    public void enterNoun3() {
        System.out.println("Give me a noun.");
        setNoun3(scanner.nextLine());
    }
    
    public void enterAdjective1() {
        System.out.println("Give me an adjective.");
        setAdjective1(scanner.nextLine());
    }
    
    public void enterAdjective2() {
        System.out.println("Give me an adjective.");
        setAdjective2(scanner.nextLine());
    }
    
    public void enterAdverb() {
        System.out.println("Give me an adverb.");
        setAdverb(scanner.nextLine());
    }
    
    public void putTogetherTheStory(){
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
        if(num == 0) {
            story = "Jesse and her best friend "+getName()+" went to Disney World today!\nThey saw a "+getNoun1()+" in a show at the Magic Kingdom\nand ate a "+getAdjective1()+" feast for dinner./nThe next day I ran "+getAdverb()+" to meet Mickey Mouse in his "+getNoun2()+"\nand then that night I gazed at the "+getRandomNums() + " " + getAdjective2() + " fireworks shooting from the " + getNoun3() + ".";
        }else{
            story = "Amanda and her frenemy "+getName()+" went to the zoo last summer.\nThey saw a huge " + getNoun1()+" and a tiny little "+getNoun2() + ".\nThat night they decided to climb " + getAdverb()+" into the " + getNoun3()+ " to get a closer look.\nThe zoo was " + getAdjective1()+ " at night, but they didn't caree...\nuntil " + getRandomNums()+ " " + getAdjective2() + " apes yelled in their faces, making Amanda and " + getName() + " sprint all the way back home.";
        }
        setStory(story);
    }
    
    public void play() {
        enterName();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdjective1();
        enterAdjective2();
        enterAdverb();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();
    }
    
}
