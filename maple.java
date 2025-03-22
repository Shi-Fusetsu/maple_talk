public class maple
{
    public static void main(String[] args)
    {
        /* Instance */
        Scanner scan = new Scanner(System.in);
        String saying, response;
        int handler = 1;

        while (handler != 0) 
        {
            System.out.print("数値を入力してください：(0:終了, 1:実行)");
            handler = scan.nextInt();
            System.out.print("しい：");
            saying = scan.nextLine();

            switch (saying) {
                case "疲れた":
                    System.out.println("ご苦労だった");
                    break;
                    
                case "幸せの白い粉とは？":
                    System.out.println("砂糖か？");
                    break;

                case "駄作を生み出しちゃった":
                    System.out.println("駄作でも何かを作るということ自体が大事なんだ");
                    break;

                case "研究内容は？":
                    System.out.println("メンバーの観察……ではなく、科学技術の研究をしている");
                    break;

                case "エナジードリンクこぼしちゃった……":
                    System.out.println("まずはティッシュで吸わせるんだ");
                    break;

                case "嫌いだ":
                    System.out.println("そうかそうか、それでも構わない");
                    break;
            }
        }
    }
}