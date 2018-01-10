def alphabet_position(text):
  output = ''
  for i in text.lower():
      if i.isalpha():
          output = output + str(ord(i) - 96) + ' '
  output = output.strip()
  return output
