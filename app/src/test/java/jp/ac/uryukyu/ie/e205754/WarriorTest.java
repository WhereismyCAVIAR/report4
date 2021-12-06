package jp.ac.uryukyu.ie.e205754;

 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;

 class WarriorTest {
     /**
      * Heroクラスからオブジェクトを生成し、attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを確認する。
      */
     @Test
     void attackWithWeponSkillTest() {
         int defaultWarriorAttack = 100;
         int previousEnemyHitPoint;
         Warrior demoWarrior = new Warrior("デモ戦士", 400, defaultWarriorAttack);
         Enemy slime = new Enemy("スライムもどき", 450, 100);
         for(int i = 0; i < 3; i++){
             previousEnemyHitPoint = slime.hitPoint;
             demoWarrior.attackWithWeponSkill(slime);
             slime.attack(demoWarrior);
             assertEquals(previousEnemyHitPoint - slime.hitPoint, (int)(1.5 * defaultWarriorAttack));
         }
     }
 }