package x

import org.scalatest.FunSpec

class MyVendingMachineTest extends FunSpec {

  describe("MyVendingMachine::operations") {
    it("should accept initial inventory") {
      val result = new MyVendingMachine().addStockItem("candy", 2, 5)
      assert(result == 5)
    }
    it("should accept more deposits") {
      val machine = new MyVendingMachine()
      machine.deposit(10)
      machine.deposit(10)
      assert(machine.balance() == 20)
    }
  }


//
//  "check item price" in {
//    val machine = new MyVendingMachine
//    machine.addStockItem("candy", 2, 5)
//    // ## TODO-2 : check price : add condition & parameter
//    //machine.checkPrice("candy") ??? ???
//    1 mustEqual 0  // dummy for compilation, remove when ready
//  }
//  "accept deposit" in {
//    // ## TODO-3  : create a vending machine, and add some money
//    // val machine = new ???
//    // machine.deposit(1) ???   ???
//    // machine.deposit(1) ???   ???
//    1 mustEqual 0  // dummy for compilation, remove when ready
//  }
//
//  "allow to buy item" in {
//    val machine = new MyVendingMachine
//    machine.addStockItem("candy", 2, 5)
//
//    // TODO-4a : deposit $2
//    // machine.???
//
//    // TODO-4b : buy candy
//    // machine.buy("???")
//
//    // TODO-4c : check balance, should be zero
//    // machine.balance ??? ???
//
//    // TODO-4d : check stock of candy, must be ???
//    // machine.checkStock("candy") ??? ???
//    1 mustEqual 0  // dummy for compilation, remove when ready
//  }
//
//  "not allow to buy without enough money" in {
//    val machine = new MyVendingMachine
//    machine.addStockItem("candy", 2, 5)
//    machine.deposit(1)
//
//    // TODO-5 : check for 'NotEnoughMoney' return code
//    // machine.buy("candy") mustEqual ???
//    1 mustEqual 0  // dummy for compilation, remove when ready
//  }
//
//  "provide correct change" in {
//    // TODO-6 : implemnent this test
//    //          deposit $1 and then $2,  buy candy
//    //          check for 'Success' code
//    //          balance must be $1
//    1 mustEqual 0  // dummy for compilation, remove when ready
//  }
//
//  // TODO-7 : inspect exception handling test
//  "throw an exception when checking price on an item out of stock" in {
//    def x = {
//      val machine = new MyVendingMachine
//      machine.checkPrice("x")
//    }
//    x must throwA[Exception]
//  }
//
//  // TODO-8 : bonus lab : come up with another test case
//
//
//
}
