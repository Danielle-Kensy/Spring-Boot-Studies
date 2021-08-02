import { http } from './api'

export default {

  findAll:() => {
      return http.get('characters');
  },

  store:(character) => {
    return http.post('characters', character);
  },

  delete:(character) => {
    return http.delete(`characters/${character.id}`, { data: character });
  },

  update:(character) => { 
    return http.put(`characters/${character.id}`, character);
  }
}
