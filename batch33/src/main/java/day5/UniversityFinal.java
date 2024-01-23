package day5;

final class UniversityFinal {
    final int noOfBranches=90;
    final int blockksPerBranch(){
        System.out.println("For every branch there should be atleast 3 blocks");
        return noOfBranches*3;
    }
}
