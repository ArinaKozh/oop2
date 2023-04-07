package water;

import java.util.ArrayList;
import java.util.List;

public class Oceanarium {
    private List<WaterAnimal> fish = new ArrayList<>();
    
    public List<WaterAnimal> addFish(WaterAnimal newFish){
        this.fish.add(newFish);
        return this.fish;
    }

    public void showAll(){
        for(WaterAnimal f:this.fish){
            System.out.print(f);
        }
    }

    private List<Bubblemakeable> bubblemakers(){
        List<Bubblemakeable> res = new ArrayList<>();
        for (WaterAnimal f:this.fish){
            if(f instanceof Bubblemakeable){
                res.add((Bubblemakeable)f);
            }
        }
        return res;
    }
    public void bubblemaking(){
        for (Bubblemakeable bubbles:bubblemakers()){
            System.out.printf("(%d) ", bubbles.bubbles());
        }
    }
    public WaterAnimal ChampionByBubbles(){
        List<Bubblemakeable> start = bubblemakers();
        Bubblemakeable champ = start.get(0);
        for(Bubblemakeable candidate:start){
            if (champ.bubbles()<candidate.bubbles()){
                champ = candidate;
            }
        }
        return (WaterAnimal)champ;
    }
    public WaterAnimal ChampionBySpeed(){
        List<WaterAnimal> start = this.fish;
        WaterAnimal champ = start.get(0);
        for (WaterAnimal f:start){
            if (champ.speed()<f.speed()){
                champ = f;
            }
        }
        return champ;
        
    }

}
