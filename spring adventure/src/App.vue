<template>
  <div id="app">

    <header class="col s12">
      <img  class="col s6" src="./assets/logo.png" alt="skull with a dagger spiked.">
      <div class="menu col s6">
        <ul>
          <li><a href="index.html">Home</a></li>
          <li><a href="#story" class="scroll">Story</a></li>
          <li><a href="#races" class="scroll">Races</a></li>
          <li><a href="#rules" class="scroll">Rules</a></li>
          <li><a href="#character" class="scroll">Character</a></li>
        </ul>
      </div>
    </header>

    <section id="story" class="container-fluid">
      <h1>STORY</h1>
      <div class="story">
        <p>in this <strong>magic</strong> world there is four kingdoms: the summer, the winter,
        the autumn and the spring, and those control the <strong>balance of the seasons</strong> on Earth.</p>
        <p>one day the famous <strong>necromancer</strong> called robson, who controls
        the change of seasons, was looking for his stilled necrobook.
        he travels into the time and accidentally fall in a trap endded up staying stuck in the
        <strong>season of spring</strong> causing a desorder in the natural order
        of this universe.</p>
        <p>now robson needs to recover his <strong>necrobook</strong> while trying to find
        a way out to escape season of spring and restore the natural
        <strong>balance of the seasons</strong>, cause if the book stays in wrong
        hands any longer it will be used for the evil and the peace of the
        kingdoms will be destroyed.</p>
        <p>your mission is to help robson to restore the peace of the
        seasons and recover his book, and this isn´t going to be a easy
        mission, you will need to fight with a lot of monsters while
        trying to dicover who stilled the book. are you ready? </p>
      </div>
    </section>

    <section id="races" class="container-fluid">
      <h1>RACES</h1>
        <article class="elf">
          <figure class="image">
            <img src="./assets/elf.png" style="height:190px;" alt="a elf with green clothes, bow and arrow">
          </figure>
            <h2>ELF</h2>
            <p>Normally this breed has a lot of affinity using bow and
            arrows, are very skilled and accurate and also have
            great affinity with magic what makes them a very powerful race.
            They also are from the forest and are very connected to
            nature, you will not want to find them on the battlefield.</p>
        </article>

        <article class="undead">
          <figure class="image">
            <img src="./assets/undead.png" style="height:190px;" alt="a undead">
          </figure>
            <h2>UNDEAD</h2>
            <p>They are very cold beings that normally only care about them
            themselves, has great affinity with magic and contrary to what
            many think they are very agile and strong, they get along with
            short distances weapons usually work alone but can also
            be very powerful working in groups.</p>
        </article>

        <article class="human">
          <figure class="image">
            <img src="./assets/human.png" style="height:190px;" alt="a human with an axe and battle clothes.">
          </figure>
            <h2>HUMAN</h2>
            <p>One of the weaker breeds, but make no mistake, the
            humans can also be very powerful warriors and have
            affinity with all types of weapons some may also have
            a lot of affinity with magic they are very loyal and almost always
            go on group missions.</p>
        </article>

        <article class="alien">
          <figure class="image">
            <img src="./assets/alien.png" style="height:190px;" alt="an alien in his spaceship">
          </figure>
            <h2>ALIEN</h2>
            <p>The most mysterious of all races has great affinity with
            firearms, say their affinities with magic are very
            powerful for being mystical beings, nobody knows very well
            because they inhabit the kingdoms or when they arrived, it is a very race
            ancient and powerful.</p>
        </article>
    </section>
     .<!-- esse ponto é essêncial -->
    <section id="rules" class="container-fluid">
      <h1>RULES</h1>
      <div class="rules">
          <p>✦ You only can have fica characters. </p>
          <p>✦ Respect the Other Players' Time. </p>
          <p>✦ Different People Like Different Things (And That's Ok). </p>
          <p>✦ Be an Active Player. </p>
          <p>✦ If your character die deal with that and make another one. </p>
          <p>✦ Be a good loser nobody wants to hear your cry. </p>
          <p>✦ Have fun :) </p>
      </div>
    </section>

   <form id="character" class="col s12" @submit.prevent="storeAndUpdateCharacter">
     <h1>MAKE YOUR CHARACTER</h1>
     <fieldset class="big">
       <fieldset class="small">
         <legend style="font-size:15pt;">Character Register</legend>
         <div class="row">
           <div class="input-field col s3">
             <input type="text" v-model="character.name" pattern="[A-Z a-z\s]+$">
             <label>Name</label>
           </div>
           <div class="input-field col s3">
           <select v-model="character.race">
              <option value="" disabled selected>Choose the Race</option>
              <option value="Elf">Elf</option>
              <option value="Undead">Undead</option>
              <option value="Human">Human</option>
              <option value="Alien">Alien</option>
            </select>
           </div>
           <div class="input-field col s2">
             <input type="number" v-model="character.age" pattern="[0-9] +$">
             <label>Age</label>
           </div>
           <div class="input-field col s3">
             <select v-model="character.primaryWeapon">
                <option value="" disabled selected>Choose primary weapon</option>
                <option value="Sword">Sword</option>
                <option value="Laser Weapon">Laser Weapon</option>
                <option value="Magic Wand">Magic Wand</option>
                <option value="Two Hand Sword">Two Hand Sword</option>
                <option value="bow">Bow</option>
              </select>
           </div>
           <div class="col s3">
             <label style="font-size:13pt;">Gender:</label>
             <div>
              <label>
                <input name="sex" value="Female" type="radio" checked v-model="character.gender" />
                <span>Female</span>
              </label>
            </div>
            <div>
              <label>
                <input name="sex" value="Male" type="radio" v-model="character.gender" />
                <span>Male</span>
              </label>
            </div>
            <div>
              <label>
                <input name="sex" value="Others" type="radio" v-model="character.gender" />
                <span>Others</span>
              </label>
            </div>
           </div>
           <div class="input-field col s2">
             <input type="number" v-model="character.hp" pattern="[0-9] +$">
             <label>Set HP</label>
           </div>
           <div class="input-field col s2">
             <input type="number" v-model="character.mp" pattern="[0-9] +$">
             <label>Set MP</label>
           </div>
           <div class="input-field col s2">
             <input type="number" v-model="character.height" pattern="[0-9] +$">
             <label>Set height</label>
           </div>
           <div class="input-field col s3">
             <select v-model="character.secondary_weapon">
                <option value="" disabled selected>Select the secondary weapon</option>
                <option value="Banana">Banana</option>
                <option value="Axe">Axe</option>
                <option value="Plactic Dinossaur">Plactic Dinossaur</option>
                <option value="Dagger">Dagger</option>
                <option value="Spagetti Sword">Spagetti Sword</option>
              </select>
           </div>
         </div><!-- row div -->
       </fieldset> <!-- fecha menor -->
       <br>
     <button class="waves-effect waves-light light-green btn-small">Save</button> &nbsp;
     <button class="waves-effect waves-light pink btn-small" type="reset">Clean</button>
   </fieldset> <!-- fecha maior -->
   </form>

   <div class="table">
      <table class="centered striped" v-show="characters.length>0">
        <thead>
          <th>ID</th>
          <th>Name</th>
          <th>Race</th>
          <th>Age</th>
          <th>Gender</th>
          <th>Primary-Weapon</th>
          <th>HP</th>
          <th>MP</th>
          <th>Height</th>
          <th>Secondary-Weapon</th>
          <th>Alter</th>
          <th>Delete</th>
        </thead>
        <tfoot>
          <th>ID</th>
          <th>Name</th>
          <th>Race</th>
          <th>Age</th>
          <th>Gender</th>
          <th>Primary-Weapon</th>
          <th>HP</th>
          <th>MP</th>
          <th>Height</th>
          <th>Secondary-Weapon</th>
          <th>Alter</th>
          <th>Delete</th>
        </tfoot>
        <tbody>
          <tr v-for="character in characters" :key="character.id">
            <td>{{character.id}}</td>
            <td>{{character.name}}</td>
            <td>{{character.race}}</td>
            <td>{{character.age}}</td>
            <td>{{character.gender}}</td>
            <td>{{character.primaryWeapon}}</td>
            <td>{{character.hp}}</td>
            <td>{{character.mp}}</td>
            <td>{{character.height}}</td>
            <td>{{character.secondary_weapon}}</td>
            <td>
              <button @click="updateCharacter(character)" class="waves-effect waves-light lime darken-2 btn-small">Alter</button>
            </td>
            <td>
              <button @click="deleteCharacter(character)" class="waves-effect waves-light pink btn-small">Delete</button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>

    <h2>PLAY NOW!</h2>
    <div class="play">
      <button onclick="M.toast({html: 'COMING SOON!'})" class="centered waves-effect waves-light light-green btn-large">PLAY</button>
    </div>
  </div>
</template>

<script type="text/javascript">
import CharacterService from './services/characterservices'

export default {
  data() {
    return {
      character: {
        id: '',
        name: '',
        race: '',
        age: '',
        gender: '',
        primary_weapon: '',
        hp: '',
        mp: '',
        height: '',
        secondary_weapon: ''
      },
      characters: []
    }
  },
  mounted() {
    this.listCharacters();
  },
  methods: {
    listCharacters() {
      CharacterService.findAll().then(response => {
        this.characters = response.data;
      });
    },
    storeAndUpdateCharacter() { //F

      if(!this.character.id) {
        CharacterService.store(this.character).then(response => {
          alert("Personagem registrado com sucesso!");
          this.listCharacters();
          this.character = {};
          return response; //gambizinha 10/10
        }).catch(error => {
          return error;
        });
      } else {
        CharacterService.update(this.character).then(response => {
          alert("Personagem Atualizado com sucesso!");
          this.listCharacters();
          this.character = {};
          return response; //gambi 10/10
        });
      }
    },
    deleteCharacter(character) {
      if(confirm("Deseja excluir o personagem?!")) {
        CharacterService.delete(character).then(response => {
          alert("Personagem excluido com sucesso!");
          this.listCharacters();
          return response;
        });
      }
    },
    updateCharacter(character) {
      this.character = character;
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  width: 90%;
  background-color: rgba(207, 237, 183, 0.5);
  margin: 0 auto;
  border-radius: 20px;
  background-attachment: fixed;
}

body {
background-image: url(assets/bg.png);
}

.banner {
  background-image: url(assets/header.png);
  background-size: 100% 100%;
  background-position: center;
}

h1 {
  background-color: #9D82BD;
  height: 80px;
  padding: 7px;
  font-family: fantasy;
  color: #ffffff;
  text-align: center;
  letter-spacing: 3px;
  text-shadow: 1px 1px 1px black;
}

h2 {
  background-color: #155A53;
  height: 45px;
  padding: 7px;
  font-family: Arial Black;
  font-size: 20pt;
  color: #ffffff;
  text-align: center;
  letter-spacing: 3px;
  text-shadow: 1px 1px 1px black;
}

p {
  font-size: 16px;
	margin-left: 10px;
  margin-right: 10px;
	padding:5px;
	text-align: center;
  text-shadow: 1px 1px 1px white;
}

.elf, .undead, .human, .alien {
  float: left;
  width: 25%;
  padding: 0.5%;
  border: 10px;
  height: 540px;
}

.image {
background-size: 100% 100%;
background-position: right;
}

.rules {
  margin-left: 400px;
  margin-right: 400px;
  border-radius: 20px;
  letter-spacing: 2px;
}

.big {
	width: 90%;
	margin:0 auto;
	border-radius:20px;
  border: 3px dashed;
  border-color:  #155A53;
	/* background: rgba(217, 190, 232, 0.2); */
}

.small {
	border-radius: 20px;
  border: 3px dashed;
  border-color:  #155A53;
  font-family: fantasy;
  color: #8e998b;
  letter-spacing: 3px;
  }

.table {
  width: 90%;
  margin: 0 auto;
  margin-top: 20px;
  margin-bottom: 20px;
  border-radius: 10px;
}

.play {
  margin-right: 600px;
  margin-left: 600px;
  margin-bottom: 10px;
  padding-bottom: 20px;

}

.menu {
  width: 60%;
  float: right;
  height: 70px;
  font-size: 15pt;
  margin-top:10%;
  margin-right: 15%;
  background-color: #9D82BD;
  border-radius: 20px
}

.menu ul {
  list-style-type: none;
  padding: 1;
  line-height: 1;
}

.menu ul li {
  text-align: center;
  margin-left: 10px;
  display: inline-block;
}

.menu ul li a {
  display: block;
  color: #2B1D3A;
  text-decoration: none;
  padding: 10px 30px 10px 30px;
  text-transform: uppercase;
}

.menu ul li a:hover {
  color: #ffffff;
  border-radius: 10px;
  background-color: #155A53;
}
</style>
