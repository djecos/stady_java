package ru.lesson.lessions;


public class Calculator {
    private int result;

    //add
    public void add(int... params)throws UserExeption{
        for (Integer param:params){
            if (params.length > 0){
                this.result +=param;
            } else if (params.length<0){
                throw new UserExeption("You should enter args");
            }
        }
    }
    //subtraction
    public void subtraction(int... params)throws UserExeption{
        for (Integer param:params){
            if (result>param){
                this.result -=param;
            }else if (result<param){
                this.result =param;
            }
        }
    }

    //div
    public void div(int... params)throws UserExeption{
        for (Integer param:params){
            if (this.result == 0){
                this.result = param;
            } else if (this.result>0){
                this.result /= param;
            } else if (this.result<0){
                throw new UserExeption("You should enter args");
            }
        }
    }
    //multiplication
    public void multiplication(int... params){
        for (Integer param:params){

            if (this.result>0){
                this.result *= param;
            }else if(this.result==0){
                this.result = param;
            }
        }
    }


    /**
     * вычисляем деление
     * @param args
     * @throws UserExeption Если аргумента нет викидуем исключение.
     */

    public void divInCycle(int... args) throws UserExeption{
        if (args.length > 0){
            this.result = args[0];
            for (int params:args){
                if (params==0){
                    throw new IllegalArgumentException("You try to div by 0, Please change arg");
                }
                this.result /= params;
            }
        }else{
            throw new UserExeption("You should enter args");
        }
    }

    public int getResult() {
        return this.result;
    }

    public void clearResult(){
        this.result = 0;
    }
}
