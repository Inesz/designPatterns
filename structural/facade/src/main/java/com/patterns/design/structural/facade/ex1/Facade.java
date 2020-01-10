package com.patterns.design.structural.facade.ex1;

public class Facade {

    private MonoA monoA = new MonoA();
    private MonoB monoB = new MonoB();
    private AddData addData = new AddData();
    private GetData getData = new GetData();


    public String getABorBA(){
        return getABorBA(getData.getSomeData());
    }

    public String getABorBA(String data){
        return comp(data);
    }

    private String comp(String data){
        if(monoA.Mono().contains(data)){
            return addData.concatData(monoA.Mono(), monoB.Mono());
        }else if(monoB.Mono().contains(data)){
            return addData.concatData(monoB.Mono(), monoA.Mono());
        }else{
            return "Data not found";
        }

    }

}
