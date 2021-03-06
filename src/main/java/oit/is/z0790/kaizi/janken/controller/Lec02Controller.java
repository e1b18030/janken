/* package oit.is.inudaisuki.springboot_samples.controller; */
/*  package oit.is.z0790.kaizi.janken.controller; */
package oit.is.z0790.kaizi.janken.controller;

import oit.is.z0790.kaizi.janken.model.Entry;
import oit.is.z0790.kaizi.janken.model.User;
import oit.is.z0790.kaizi.janken.model.UserMapper;
import oit.is.z0790.kaizi.janken.model.Match;
import oit.is.z0790.kaizi.janken.model.MatchMapper;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lec02Controller {

  // @param name
  // @param model
  // @return

  /*
   * @PostMapping("/lec02") public String lec02(@RequestParam String name,
   * ModelMap model) { model.addAttribute("name", name); return "lec02.html"; }
   */
  /*
   * @GetMapping("/lec02") public String lec02() { return "lec02.html"; }
   */
  @Autowired
  private Entry entry;

  @Autowired
  private UserMapper userMapper;
  
  @Autowired
  MatchMapper MatchMapper;

  @GetMapping("/lec02")
  public String lec02Entry(Principal prin, ModelMap model) {
    String loginUser = prin.getName();
    this.entry.addUser(loginUser);
    model.addAttribute("entry", this.entry);
    ArrayList<User> users = userMapper.selectAllUsers();
    model.addAttribute("users", users);
    ArrayList<Match> Match1 = MatchMapper.selectAllMatches();
    model.addAttribute("Match1", Match1);

    return "lec02.html";
  }


@Autowired
  UserMapper UserMapper;

@GetMapping("lec02/{id}")
public String lec02id(@PathVariable Integer id, ModelMap model) {
  /*
  User User2 = UserMapper.selectById(id);
  model.addAttribute("User2", User2);
  */

  return "lec02.html";
  }


  @GetMapping("/lec02janken")
  public String lec02Janken(@RequestParam String hand, ModelMap model) {
  model.addAttribute("myhand", hand);

  return "lec02.html";
  }

  }

  /* 自分 */
/*
 * @Controller public class Lec02Controller { //@param name //@param Model
 * //@return
 *
 * @GetMapping("/lec02") public String lec02(@PathVariable String name, ModelMap
 * model) { model.addAttribute("name", name); return "lec02.html"; } }
 */

/*
 * ↑参考 public String sample25(@RequestParam Integer kakeru1, @RequestParam
 * Integer kakeru2, ModelMap model) { int kakeruResult = kakeru1 * kakeru2;
 * model.addAttribute("kakeruResult", kakeruResult); return "sample24.html"; }
 */

/* 以下、Sample21Controllerコピペ部分 */
/*
 * Sample2-2
 *
 * @param tasu1
 *
 * @param tasu2
 *
 * @param model
 *
 * @return
 */
/*
 * @GetMapping("/sample23") public String sample23(@RequestParam Integer
 * tasu1, @RequestParam Integer tasu2, ModelMap model) { int tasuResult = tasu1
 * + tasu2; model.addAttribute("tasuResult2", tasuResult); //
 * ModelMap型変数のmodelにtasuResult2という名前の変数で，tasuResultの値を登録する． //
 * ここで値を登録するとthymeleafが受け取り，htmlで処理することができるようになる return "sample21.html";
 * sample21.html <div> (2) <!--Queryパラメータ--> <a
 * href="/sample23?tasu1=2&tasu2=3">2+3</a>=[[${tasuResult2}]] </div>
 */
/*
 * }
 */
