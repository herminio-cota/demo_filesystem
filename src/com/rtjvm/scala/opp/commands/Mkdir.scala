package com.rtjvm.scala.opp.commands

import com.rtjvm.scala.oop.filesystem.State
import com.rtjvm.scala.opp.files.Directory
import com.rtjvm.scala.opp.files.DirEntry

class Mkdir(name: String) extends CreateEntry(name) {
  
  override def createSpesificEntry(state: State): DirEntry = 
    Directory.empty(state.wd.path, name)
  
}
  
