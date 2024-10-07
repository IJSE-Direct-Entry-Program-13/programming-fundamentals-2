void main(){
    myBlock1:
    if(true){
        System.out.println("Entered into block1");
        myBlock2:
        if (true){
            System.out.println("Entered into block2");
            if (true) break myBlock2;
        } else
        myBlock3:{
            System.out.println("Entered into block3");
            myBlock4:
            if (true){
                System.out.println("Entered into block4");
                if (true) break myBlock2;
                System.out.println("Exiting from block4");
            }
            System.out.println("Just exited from block 4");
        }
        System.out.println("Just exited from either block 2 or block 3");
    }
    System.out.println("Just exited from the block 1");
}