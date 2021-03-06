import { Injectable } from '@angular/core';
import { IWord } from './iword';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  private words: IWord[] = [
    {
      key: 'service',
      meaning: 'dịch vụ'
    }, {
      key: 'service provider',
      meaning: 'nhà cung cấp dịch vụ'
    }, {
      key: 'provide',
      meaning: 'cung cấp'
    }, {
      key: 'efficient',
      meaning: 'hiệu quả'
    }, {
      key: 'snow',
      meaning: 'tuyết'
    }
  ];
  constructor() { }
  search(word: string): IWord {
    if (!word) {
      return null;
    }
    const w = this.words.find(item => item.key === word.toLowerCase());
    if (w) {
      return w;
    }
    return null;
  }

  getAll(): IWord[] {
    return this.words;
  }
}
