package com.liu;


//2026.7.16


public class Demo04Copy {


    //方法 输出棋盘布局 统计棋子数量
    public static void chessPlay(int[][] chess){

        System.out.println("棋盘如下：");
        int sum = 0;
        int white = 0;
        int black = 0;
        for (int ints[] : chess){              //输出棋盘布局
            for (int x : ints){

                if(x != 0) {
                    sum++;
                    if (x == 1) {
                        black++;
                    } else {
                        white++;
                    }
                }

                System.out.print(x+"\t");
            }
            System.out.print("\n");
        }
        //输出棋子数量
        System.out.println("棋盘上棋子的个数为："+sum+"\n白棋个数为："+white+"\n黑棋个数为："+black);

    }


    //方法  将棋盘压缩存储
    public static int[][] chessCut(int[][] chess){

        int sum = 0;                    //统计棋子数量
        for (int ints[] : chess) {
            for (int x : ints) {

                if (x != 0) {
                    sum++;
                }
            }
        }


        int [][] chessC = new int[sum+1][3];        //创建压缩数组
        chessC[0][0] = chess.length;
        chessC[0][1] = chess.length;
        chessC[0][2] = sum;
        //压缩操作
        int count = 0;
        for (int i = 0; i < chess.length;i++){
            for (int j = 0; j <chess[i].length;j++){

                if (chess[i][j]!=0){
                    count++;
                    chessC[count][0] = i;
                    chessC[count][1] = j;
                    chessC[count][2] = chess[i][j];
                }

            }
        }
        //输出压缩结果
        System.out.println("--------------------\n压缩结果如下：");
        for (int ints[] : chessC) {
            for (int x : ints) {

                System.out.print(x+"\t");

                }
            System.out.print("\n");
            }

        return chessC;











    }


    //方法   将压缩数组还原成棋盘并打印棋盘
    public static void chessBack(int[][] chess){

        int[][] chessB = new int[chess[0][0]] [chess[0][1]];    //创建还原数组

        //还原
        for (int i = 1; i < chess.length;i++){

            chessB[chess[i][0]] [chess[i][1]] = chess[i][2];

        }

        //输出还原的棋盘
        System.out.println("--------------------\n还原结果如下：");
        for (int ints[] : chessB) {
            for (int x : ints) {

                System.out.print(x+"\t");

            }
            System.out.print("\n");
        }



    }



    //main
    public static void main(String[] args) {

        System.out.println("实例：11*11的棋盘 稀疏存储棋盘 1表示黑棋 2表示白棋");
        int[][] chessBoard = new int[11][11];       //创建棋盘数组
        chessBoard[0][0] = 2;                       //赋值
        chessBoard[1][2] = 1;
        chessBoard[2][3] = 1;
        chessBoard[6][8] = 2;
        chessBoard[9][8] = 2;

        chessPlay(chessBoard);                       //调用方法  打印棋盘布局

        int[][] chessC = chessCut(chessBoard);      //调用方法 压缩存储   返回压缩数组

        chessBack(chessC);                          //调用方法 还原棋盘



        System.out.println("-----------------\n案例完成！");


        }










}

